package task4;

public class Computer {
    String processor;
    String ram;
    public static void main(String[] args) {
        Computer [] arrComputers = new Computer[5];
        arrComputers[0] = new Computer();
        arrComputers[1] = new Computer();
        arrComputers[2] = new Computer();
        arrComputers[3] = new Computer();
        arrComputers[4] = new Computer();

        for (int i = 0; i < arrComputers.length; i++) {
            arrComputers[i].processor="Intel core i"+i;
            arrComputers[i].ram=i+" GB RAM";
        }
        for (Computer computer :
                arrComputers) {
            System.out.println(computer.processor+" "+ computer.ram);
        }

    }

}
