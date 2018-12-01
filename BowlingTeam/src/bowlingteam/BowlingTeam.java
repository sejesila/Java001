
package bowlingteam;


public class BowlingTeam
{
    private String teamName;
private String[] members = new String[4];
int member;

    public int getMember() {
        return member;
    }


    public void setMember(int member,String s) {
        this.member = member;
    }


    public String getTeamName()
    {
        return teamName;
    }

    public String[] getMembers()
    {
        return members;
    }

    public void setTeamName(String teamName) 
    {
        this.teamName = teamName;
    }

    public void setMembers(String[] members)
    {
        this.members = members;
    }



    
    
}
