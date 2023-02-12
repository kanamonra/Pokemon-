public class pikachuSub extends super_pokemon{

    private String name;
    public pikachuSub(String owner, String skills) // pikachu constructor
    {
        super(owner, skills);
        this.name = "피카츄";
    }
    @Override
    public void sound() {
        System.out.print("피카피카 ⊂(๑•.•๑)");
    }
    @Override
    public void show_info(){
        System.out.println("포켓몬 정보: 피카츄\n특징: 귀여움, 전기 공격이 최고임");
    }
    @Override
    public void attack(){System.out.printf("[피카피카!] " + owner+ "의" + name+ "가" + skills + "공격 시전! (ง’̀-‘́)ง");}

}

