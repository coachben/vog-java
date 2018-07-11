


    String text = "";
    int []entry = Integer.parseInt().split("");
    String numOnly = text.replaceAll("\\p{a}","");
    try {
      
        double numVal = Double.valueOf(numOnly);
        System.out.println(text +" contains numbers");
    } catch (NumberFormatException e){
        System.out.println(entry+" not contains numbers");