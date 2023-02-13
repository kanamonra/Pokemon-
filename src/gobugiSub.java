public class gobugiSub extends super_pokemon{
    private final String name;

    public gobugiSub(String owner, String skills)
    {
        super(owner, skills);
        this.name = "꼬부기";
    }
    @Override
    public void sound() {
            System.out.print("꼬복꼬복! <◕°ω°◕>\n");
        }
    @Override
    public void show_info(){
            System.out.println("포켓몬 정보: 꼬부기\n특징: 수영 가능, 물에서 강함");
            int idx = 0;
            for (String skill : skills){
                System.out.println("스킬 정보: ");
                System.out.println(idx++ + " : " + skill);}
        }
    @Override
    public void attack(String x)
    {
        System.out.println(owner + "의 " + name + "가 " + x + " 공격 성공! ( う-*)づ̿╤── <(˚☐˚”)");
    }
    public void swim(){
        System.out.println("꼬부기가 수영을 합니다.‿︵‿ヽ(゜□゜ )ノ‿︵‿");
    }
}


