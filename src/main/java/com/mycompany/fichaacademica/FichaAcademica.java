/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fichaacademica;

/**
 *
 * @author cauam
 */
public class FichaAcademica {

    public static void main(String[] args) {

        Alunos aluno1 = new Alunos("Joao", "001", 7.0, 8.0);
        Alunos aluno2 = new Alunos("Maria", "002", 9.0, 8.5);
        Alunos aluno3 = new Alunos("Pedro", "003", 5.0, 4.0);

        Alunos[] alunos = {aluno1, aluno2, aluno3};

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Nome: " + alunos[i].getNome());
            System.out.println("Media: " + alunos[i].calcularMedia());
            System.out.println("Situacao: " + alunos[i].obterSituacao());
            System.out.println();
        }

        System.out.println("Nota :  " + aluno1.getNota1());

        aluno1.setNota1(9.0);
        System.out.println("Depois da alteracao : " + aluno1.getNota1());

        aluno1.setNota1(15.0);
        System.out.println("Depois da alteracao invalida: " + aluno1.getNota1());
    }
}