import { getTokenRegister } from './register/register.js'
import './login/loginboard.js'

function open () {
  window.addEventListener('hashchange', event => {
    const hash = window.location.hash
    switch (hash) {
      case '#register':
        document.body.innerHTML = ''
        document.body.appendChild(document.createElement('register-board'))
        break
      case '#login':
        document.body.innerHTML = ''
        document.body.appendChild(document.createElement('login-board'))
        break
      default:
        document.body.innerHTML = ''
        document.body.appendChild(document.createElement('login-board'))
        break
    }
  })
}

export async function checkCode () {
  if (window.location.href.indexOf('?code=') !== -1) {
    const code = window.location.href.substr(28, 90)
    document.body.appendChild(document.createElement('login-board'))
    const urlParameters = 'client_secret=3f61867e5dda13d50115096bc9b906b4&client_id=832604726948.833104713589&code=' + code
    let response = await fetch('https://slack.com/api/oauth.access', {
      method: 'POST',
      headers: {
        'Content-type': 'application/x-www-form-urlencoded'
      },
      body: urlParameters
    })
    response = await response.json()
    console.log(response)
    saveAccessToken(response)
  }
}

async function saveAccessToken (response) {
  console.log(getTokenRegister())
  await fetch('http://localhost:8080/users', {
    method: 'PUT',
    headers: {
      'Content-type': 'application/json',
      Authorization: 'Bearer ' + getTokenRegister()
    },
    body: JSON.stringify({
      slackToken: response.bot_access_token
    })
  })
}
open()
checkCode()
