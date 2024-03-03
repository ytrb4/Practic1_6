import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Вариант 3, Куранов Нурлан Расуллаевич"); // поставьте автомат
        System.out.println("Выбери врача: 1) Врач-Араб 2) Злой Врач");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Doctor doctor;
        if (num == 1) {
            doctor = new Rotcod();
        }else if (num == 2) {
            doctor = new AngryDoc();
        }else{
            System.out.println("Неверный выбор");
            return;
        }
        System.out.println("Введите текст рецепта:");
        scanner.nextLine();
        String recipe = scanner.nextLine();
        doctor.writeRecipe(recipe);
    }
}