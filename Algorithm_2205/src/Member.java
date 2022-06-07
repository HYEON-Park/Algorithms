package Algorithm_2205.src;

//객체동등비교 equals()
public class Member {

    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {

            Member member = (Member) obj;

            if (id.equals(member.id)) {
                return true;
            }
        }
        return false;
    }

}