class Receita {
    constructor(nome, calorias) {
        console.log("Nova receita");
        console.log(nome);
        console.log(calorias);
    }

}

let macarrao = new Receita("Macarrão", 600);
console.log("---");
let salada = new Receita("Salada", 400);
