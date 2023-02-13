public class pairiSub extends super_pokemon{
    private final String name;
    public pairiSub(String owner, String skills){
        super(owner, skills);
        this.name = "파이리";
    }
    @Override
    public void show_info(){
        System.out.println("포켓몬 정보: 파이리\n특징: 강한 힘을 가지고 있음, 불처럼 뜨거움");
        int idx = 0;
        for (String skill : skills){
            System.out.println("스킬 정보: ");
            System.out.println(idx++ + " : " + skill);}
    }
    @Override
    public void sound(){
        System.out.print("파을파을! ⊂(◉‿◉)\n");
    }
    @Override
    public void attack(String x)
    {
        System.out.println(owner + "의 " + name + "가 " + x + " 공격 성공! ( う-*)づ̿╤── <(˚☐˚”)");
    }

}
