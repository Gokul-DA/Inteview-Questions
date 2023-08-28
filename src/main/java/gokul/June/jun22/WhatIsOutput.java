package gokul.June.jun22;

public class WhatIsOutput {

    public void WhatIsOutput(){
        System.out.println("Constructor");
    }

    {
        System.out.println("Instance block");
    }

    static {
        System.out.println("Static block");
    }
    private void method() {
        System.out.println("Method");
    }

    public static void main(String[] args) {
        WhatIsOutput obj = new WhatIsOutput();
        obj.method();
        //WhatIsOutput obj2 = new WhatIsOutput();
    }
}

