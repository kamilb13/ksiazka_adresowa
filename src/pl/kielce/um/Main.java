package pl.kielce.um;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    List<Person> mappedPersons = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        Person person = main.getDataFromUser();
        main.saveToFile(args[0], person);
        main.printFile(args[0]);
        main.mapRecordsToObjects(args[0]);
        main.mappedPersons.forEach(System.out::println);
    }

    private Person getDataFromUser() {
        System.out.println("Książka adresowa");
        Person personToSave = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię:");
        personToSave.setFirstName(scanner.nextLine());
        System.out.println("Podaj nazwisko:");
        personToSave.setLastName(scanner.nextLine());
        System.out.println("Podaj numer telefonu:");
        personToSave.setPhoneNumber(scanner.nextLine());
        System.out.println("Podaj miasto:");
        personToSave.setCity(scanner.nextLine());
        System.out.println("Podaj ulicę:");
        personToSave.setStreet(scanner.nextLine());
        System.out.println("Podaj kod pocztowy:");
        personToSave.setPostalCode(scanner.nextLine());
        System.out.println("Dodałeś nową osobę: " + personToSave.toString());
        return personToSave;
    }

    private boolean saveToFile(String fileName, Person personToSave) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
            bw.write(personToSave.toString());
            bw.flush();
            bw.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private void printFile(String fileName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            br.lines().forEach(System.out::println);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void mapRecordsToObjects(String fileName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            br.lines().forEach(record -> mapPerson(record));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void mapPerson(String record) {
        Person person = new Person();
        person.setFirstName(record.split(",")[0]);
        person.setLastName(record.split(",")[1]);
        person.setPhoneNumber(record.split(",")[2]);
        person.setCity(record.split(",")[3]);
        person.setStreet(record.split(",")[4]);
        person.setPostalCode(record.split(",")[5]);
        mappedPersons.add(person);
    }
}
