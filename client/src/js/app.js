import './login/loginboard.js'
import './register/register.js'
let accessToken
function open () {
  window.addEventListener('hashchange', event => {
    const hash = window.location.hash
    console.log(hash)
    switch (hash) {
      case '#register':
        document.body.innerHTML = ''
        window.location.href = 'https://slack.com/oauth/authorize?client_id=832604726948.833104713589&scope=bot'
        break
      case '#login':
        document.body.innerHTML = ''
        document.body.appendChild(document.createElement('login-board'))
        break
    }
  })
  checkCode()
}

export async function checkCode () {
  if (window.location.href.indexOf('?code=') !== -1) {
    console.log(window.location.href)
    const code = window.location.href.substr(28, 90)
    document.body.appendChild(document.createElement('register-board'))
    const urlParameters = 'client_secret=3f61867e5dda13d50115096bc9b906b4&client_id=832604726948.833104713589&code=' + code
    let response = await fetch('https://slack.com/api/oauth.access', {
      method: 'POST',
      headers: {
        'Content-type': 'application/x-www-form-urlencoded'
      },
      body: urlParameters
    })
    response = await response.json()
    setAccessToken(response.bot.bot_access_token)
    console.log(getAccessToken())
    window.location.href = 'http://localhost:4000/#register'
  }
  document.body.appendChild(document.createElement('register-board'))
}

function setAccessToken (_token) {
  accessToken = _token
}

export function getAccessToken () {
  return accessToken
}
open()
