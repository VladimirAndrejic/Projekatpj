

const table = document.getElementById('table')
const template = document.getElementById('clan')

function fetchClan(url= ''){
    fetch(`http://localhost:8080/api/clan${url}`)
.then(rsp => rsp.json())
        .then(data =>{
            if(data.length== 200){
                alert('Clan nije pronadjen')
                fetchClan()
                return
            }



data.forEach(clan => {
    const ispis = template.content.cloneNode(true)
    ispis.querySelector('.id').innerText = clan.id
    ispis.querySelector('.ime').innerText = clan.ime
    ispis.querySelector('.prezime').innerText = clan.prezime
    ispis.querySelector('.telefon').innerText = clan.telefon
    ispis.querySelector('.jmbg').innerText = clan.jmbg

    table.appendChild(ispis) // Dodavanje novog reda u tabelu

    if (confirm(`Da li zelite da obrisete ${clan.ime} ${clan.prezime}`)) {
        fetch(`http://localhost:8080/api/clan${url}`, {
            method: 'DELETE',
        })
            .then(rsp => {
                if (rsp.status == 204) {
                    window.location.href = './index.html'
                    return
                }
                alert(`Brisanje clana nije uspelo (HTTP ${rsp.status})`)
            })
    }
    tabela.appendChild(ispis)
})

        })
}



