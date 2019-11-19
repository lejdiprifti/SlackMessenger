import './register/register.js'
import './login/loginboard.js'

function open() {
    window.addEventListener('hashchange', event => {
        let hash = window.location.hash
        console.log(hash)
        switch (hash) {
            case '#register':
            document.body.innerHTML = ''
            document.body.appendChild(document.createElement('register-board'))
            break
            case '#login':
            document.body.innerHTML = ''
            document.body.appendChild(document.createElement('login-board'))
            break
        } 
    
    })
}

open()


