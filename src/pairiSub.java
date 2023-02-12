public class pairiSub extends super_pokemon{
    private String name;
    public pairiSub(String owner, String skills){
        super(owner, skills);
        this.name = "파이리";
    }
    @Override
    public void show_info(){
        System.out.println("포켓몬 정보: 파이리\n특징: 강한 힘을 가지고 있음, 불처럼 뜨거움");
    }
    @Override
    public void sound(){
        System.out.print("파을파을! ⊂(◉‿◉)");
    }
    @Override
    public void attack(){
        System.out.printf("[파을파을!] @s의 @s가 @s 공격 시전!\n( う-´)づ︻╦̵̵̿╤── \\(˚☐˚”)/", owner, name, skills);
    }
}
