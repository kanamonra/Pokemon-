public class gobugiSub extends super_pokemon{
    private String name;

    public gobugiSub(String owner, String skills)
    {
        super(owner, skills);
        this.name = "꼬부기";
    }
    @Override
    public void sound() {
            System.out.print("꼬복꼬복! <◕°ω°◕>");
        }
    @Override
    public void show_info(){
            System.out.println("포켓몬 정보: 꼬부기\n특징: 수영 가능, 물에서 강함");
        }
    @Override
    public void attack(){
            System.out.printf("[꼬복꼬복!]" + owner + "의" + name + "가"+ skills + "공격 시전!\n( う-*)づ̿╤── <(˚☐˚”)");
    }
    public void swim(){
        System.out.println("꼬부기가 수영을 합니다.‿︵‿ヽ(゜□゜ )ノ‿︵‿");
    }
}


