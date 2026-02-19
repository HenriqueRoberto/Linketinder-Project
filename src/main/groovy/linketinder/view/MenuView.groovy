package linketinder.view

import java.util.Scanner
import linketinder.model.Candidato
import linketinder.model.Empresa

class MenuView {
    private static final Scanner scanner = new Scanner(System.in)

    static int mostrarMenuInicial() {
        println "\n=== LINKETINDER - LOGIN ==="
        println "1 - Login como Candidato"
        println "2 - Login como Empresa"
        println "0 - Sair"
        print "Escolha: "
        return scanner.nextInt()
    }

    static String pedirEmail() {
        print "Digite seu email: "
        return scanner.next()
    }

    static int menuCandidato(String nome) {
        println "\n--- Bem-vindo(a), $nome ---"
        println "1 - Ver meus dados"
        println "2 - Listar Empresas"
        println "0 - Logout"
        print "Escolha: "
        return scanner.nextInt()
    }

    static int menuEmpresa(String nome) {
        println "\n--- Empresa: $nome ---"
        println "1 - Ver meus dados"
        println "2 - Listar Candidatos"
        println "0 - Logout"
        print "Escolha: "
        return scanner.nextInt()
    }

    static void exibirPerfil(Object perfil) {
        println "\n=== SEUS DADOS ==="
        println perfil.toString()
    }

    static void listarCandidatos(List<Candidato> candidatos) {
        println "\n=== CANDIDATOS CADASTRADOS ==="
        candidatos.each { println "- ${it.nome} (${it.email})" }
    }

    static void listarEmpresas(List<Empresa> empresas) {
        println "\n=== EMPRESAS CADASTRADAS ==="
        empresas.each { println "- ${it.nome} | País: ${it.pais}" }
    }

    static void exibirMensagem(String msg) {
        println msg
    }
}