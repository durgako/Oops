public class examplebreakandcontinue {
    public void breking() {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
    }
        public void contuning()
        {
            for (int i = 0; i < 5; i++)
            {
                if(i == 2)
                {
                    continue;
                }
                System.out.println(i);
            }
        }


    public static void main(String[] args) {
        examplebreakandcontinue x=new examplebreakandcontinue();
        x.breking();
        x.contuning();
    }
}
