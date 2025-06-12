alert("Ótimo, o Login é admin e senha 0001, preencha e vá para próxima tela")


function verificarLogin(event) {
    event.preventDefault(); // Impede o submit padrão

    const usuario = document.getElementById("usuario").value;
    const senha = document.getElementById("senha").value;

    if (usuario.toLowerCase() === 'admin' && senha === '0001') {
        console.log("o pilantra reconheceu a senha");
        window.location.href = 'dash.html';
    } else {
        alert("Usuário não encontrado. Consulte o README do projeto para saber o login e a senha.");
        console.log("a senha nao passouuu");
    }
}
