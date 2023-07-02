
import car.Car; //importação

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        List<Person> students = new ArrayList<Person>();
        boolean exit = true;
        while (exit) {

            Scanner scan = new Scanner(System.in);

            System.out.println("====== SEJA BEM VINDO! ======");
            System.out.println("O que você deseja?");
            System.out.println("\n(1) - Cadastrar um estudante");
            System.out.println("(2) - Buscar um estudante");
            System.out.println("(3) - Finalizar o sistema\n");
            System.out.print(" Opção:");

            int option = scan.nextInt();

            switch (option) {
                case 1:
                    addStudent(students);
                    break;

                case 2:
                    System.out.println("Qual o nome do estudante que deseja buscar?");
                    String nameToFind = scan.next();
                    findStudent(students    , nameToFind);
                    break;

                case 3:
                    System.out.println("Sistema finalizado!");
                    exit = false;
                    break;

                default:
                    System.out.println("Essa opção não existe! Tente novamente...\n\n");
                    break;
            }
        }
    }

    private static void addStudent(List<Person> students){
        Person student = new Person();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome completo do estudante: ");
        student.name = scan.next();
        students.add(student);
        System.out.println("Agradeço pela resposta! O nome cadastrado foi: " + student.name + "\n\n");
    }

    private static void findStudent (List<Person> students, String studentName){
        for(int count = 0; count < students.size(); count++){
            Person student = students.get(count);

            if(student.name.equals(studentName)){
                System.out.println("O estudante foi localizado com sucesso: " + studentName + "\n\n");
            }
        }
    }
}