var db = openDatabase("MeuBanco","2.0", "Mybase", 4048);
criar = async () => {
        await db.transaction(function(levantarBanco){
            levantarBanco.executeSql("CREATE TABLE users (ID PRIMARY KEY, email TEXT, senha TEXT)");
});
}
// setAlert = (message) => { 
//     var ele =document.createElement('div') 
//     ele.innerHTML =`<div class="alert alert-danger" role="alert">${message}</div>`
//     document.body.appendChild(ele);
// }
salvar = async () => {
    var email = document.getElementById('cadastroEmail').value;
    var senha = document.getElementById('cadastroSenha').value;
    await db.transaction(async (salvarUser) => {
        await salvarUser.executeSql("INSERT INTO users (email, senha) VALUES (?,?)",[email,senha]);
    });
    alert('Usuario Cadastrado');
}

    findBy = async () => {
        var email = document.getElementById('inputEmail').value;
        var senha = document.getElementById('inputPassword').value;

        await db.transaction(async (find) => {
            await find.executeSql("SELECT * FROM users WHERE email = ? AND senha = ?", [email, senha],
           (find, results) => {
            var len = results.rows.length;
            console.log('len', len);
            if (len > 0) {
                alert('Usuario Cadastrado');
            } else {
                alert('Usuario nao Cadastrado');
            }
           });
        });

    }   

    redirect = () => {window.location.href = "index.html"}