package linketinder.controller

import linketinder.data.DadosMock
import linketinder.view.MenuView

class AppController {

    static void iniciar() {

        def candidatos = DadosMock.candidatos()
        def empresas = DadosMock.empresas()

        while (true) {
            int opcao = MenuView.mostrarMenu()

            switch (opcao) {
                case 1:
                    println "\n=== CANDIDATOS ==="
                    candidatos.each { println it }
                    break

                case 2:
                    println "\n=== EMPRESAS ==="
                    empresas.each { println it }
                    break

                case 0:
                    println "Encerrando..."
                    return

                default:
                    println "Opção inválida."
            }
        }
    }
}
