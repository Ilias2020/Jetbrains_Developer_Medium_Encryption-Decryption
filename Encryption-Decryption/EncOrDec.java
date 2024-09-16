
public class EncOrDec {
    public static void pickEncOrDec(String[] args) {
        String encOrDec = "";
        int keyNum = 0;
        String inputStr = "";
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-mode":
                    encOrDec = args[i + 1];
                    break;
                case "-key":
                    keyNum = Integer.parseInt(args[i + 1]);
                    break;
                case "-data":
                    inputStr = args[i + 1];
                    break;
            }
        }
        String output = "";
        if (encOrDec.equals("enc")) {
            output = Encrypt.encrypt(inputStr, keyNum);
        } else if (encOrDec.equals("dec")) {
            output = Decrypt.decrypt(inputStr, keyNum);
        } else System.out.println("Error");
        System.out.println(output);
    }

}