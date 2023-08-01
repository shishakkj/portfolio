class Passaporte {
    constructor(nome, sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    obterNome(){
        return this.nome.toLowerCase()
    }
    obterSobrenome(){
        return this.sobrenome.toUpperCase()
    }
    obterNomeCompleto(){
        return ${this.nome} ${this.sobrenome}
    }
    obterIniciais(){
        return ${this.nome[0]}.${this.sobrenome[0]}.
    }
    obterEhNomeValido(){
        if(this.nome.length >= 1){
            return "Sim"
        }
        else{
            return "Não"
        }
    }
}