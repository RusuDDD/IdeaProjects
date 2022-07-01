package de.telran;

public class ExThree {
    public static void main(String[] args) {
        /*6.	Маша, Петя и Вася договорились встретиться в кафе. Маша и Петя пришли раньше.
     Петя сразу заказал 4 куска чизкейка, а Маша в два раза меньше. Они съели по одному куску,
      после чего пришел Вася и заказал еще столько кусков, сколько лежало на столе + 1.
      Поделят ли они имеющиеся на столе чизкейки на троих? Будет ли Маша счастлива,
       если ей для счастья надо съесть не меньше 4х кусков? Сделать прямо в методе main
*/
        System.out.println(deLaPinaLa(150));
        int peteaZakaz = 4;
        int mashaZakaz = peteaZakaz / 2;
        int peteaIZakazFaraVasea = peteaZakaz - 1;
        int mashaZakazFaraVasea = mashaZakaz - 1;
        int sumapeteaCuMashaFaraVasea = peteaIZakazFaraVasea + mashaZakazFaraVasea;
        int vaseaZakaz = sumapeteaCuMashaFaraVasea + 1;
        int sumaTotalaLaPrezent = (sumapeteaCuMashaFaraVasea + vaseaZakaz);
        int mashaSiela = sumaTotalaLaPrezent / 3 + mashaZakazFaraVasea;
        if (mashaSiela >= 4) {
            System.out.println("Masha e jirdeaica si o crapat = " + mashaSiela);
        } else {
            System.out.println("Masa se culca cu vasea sa slageasca");
        }
        }
      /*3.	написать функцию, которая находится ли целое число в промежутка
      от 100 до 200 (включительно) и при этом четное
       */


    static boolean deLaPinaLa(int number) {
        return number >= 100 && number <= 200 && number % 2 == 0;
    }

}


