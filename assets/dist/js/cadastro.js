var db = openDatabase("MeuBanco","2.0", "Mybase", 2 * 1024 * 1024);
var cont;
criar = async () => {
        await db.transaction(function(levantarBanco){
            levantarBanco.executeSql("CREATE TABLE users (ID PRIMARY KEY, email TEXT, senha TEXT)");
});
}


 salvar = async () =>{
    var email = document.getElementById('cadastroEmail').value;
    var teste = false;
    await db.transaction((find) =>{ 
     find.executeSql("SELECT * FROM users WHERE email = ?", [email],
    (find,results) => {
     var len = results.rows.length;
    console.log('len', len);
    if (len > 0) {
        alert('Usuario já Cadastrado');
        teste = true;
        // redirectCadastro();
    }else{
        alert("Diferente");
        // salvardb();
        teste = false;
    
    }});
});
    if(teste){
        // redirectCadastro();
        alert("Algum outro Alert");
    } else {
        // teste = false;
       await salvardb();
       alert("no else tbm");
    }
    // await Promise.all(veremos) 
//    await db.transaction(function(find){ metodo2(find)});
}

salvardb = async () => {
    var email = document.getElementById('cadastroEmail').value;
    var senha = document.getElementById('cadastroSenha').value;
    await  db.transaction(async (salvarUser) => {
        await salvarUser.executeSql("INSERT INTO users (email, senha) VALUES (?,?)",[email,senha]);
        alert("Novo usuario Cadastrado com sucesso");
       await redirectCadastro();
    });
}

    findBy = async () => {
        var email = document.getElementById('inputEmail').value;
        var senha = document.getElementById('inputPassword').value;

        await db.transaction(async (find) => {
            await find.executeSql("SELECT * FROM users WHERE email = ? AND senha = ?", [email, senha],
           (find,results) => {
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

 metodo2 = (find) =>{
    // var email = document.getElementById('cadastroEmail').value;
    // find.executeSql("SELECT * FROM users WHERE email = ?", [email],
    // (find,results) => metodo(find,results));
 }

 metodo = (find,results) =>{
    var len = results.rows.length;
    console.log('len', len);
    if (len > 0) {
        alert('Usuario já Cadastrado');
        redirectCadastro();
    } else {
      salvardb();
    }
 }
  

    redirectIndex = () => {window.location.href = "index.html"}
    redirectCadastro = () => {window.location.href = "cadastro.html"}

    