/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetudiants;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Aurelie pc neuf
 */
public class GestionEtudiants {
    private int saisie;
    private ArrayList<Etudiant> entreeEtudiant = new ArrayList<Etudiant>();
     
    public GestionEtudiants(int saisie) {
        saisie = 0;
    }

   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int saisie = 0;
        while (saisie >-1){
            System.out.println("Veuillez choisir une fonctionnalité : ");
            saisie = sc.nextInt();
            switch (saisie)
                    {
                        case 1:
                            Scanner add = new Scanner(System.in);
                            System.out.println("Vous avez choisi d'ajouter un etudiant veuillez entrer les informations suivantes :");
                            System.out.println("Nom de l'étudiant : ");
                            String _nom = add.nextLine();
                            System.out.println("Prénom de l'étudiant : ");
                            String _prenom = add.nextLine();                            
                            System.out.println("Age de l'étudiant : ");
                            int _age = add.nextInt();                           
                            add.nextLine();
                            System.out.println("Notes de l'étudiant - -1 pour terminer la saisie ");
                            int _notes = 0;
                            while (_notes > -1){
                                System.out.println("Veuillez saisir une note :  ");
                                _notes = add.nextInt();
                                _notes = _notes + _notes; /*Ne marche pas les notes s'additionne il faudrait les mettre dans un tableau 
                                mais je n'arrive pas à importer le tableau dans la methode main*/
                            }
                            System.out.println("Vous avez ajouté l'étudiant  : " + _nom + " , " + _prenom + " , " + _age  + " , " + _notes);                           
                                                       
                        break;
                        case 2:
                            System.out.println("Choix 2 : ajouter une note");
                        break;
                        default:
                            System.out.println("Veuillez choisir un nombre entre 1 et 9 ! ");

                    }
            sc.nextLine();
        
        }
        
    }
}