
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String filename=scan.nextLine();
        System.out.println("Team: ");
        String teamname=scan.nextLine();
        ArrayList<Play> Teams=new ArrayList<Play>();
        try (Scanner scannerf = new Scanner(Paths.get(filename))) {

            while (scannerf.hasNextLine()) {
                String line = scannerf.nextLine();

                String[] parts = line.split(",");
                String teamA = parts[0];
                String teamB = parts[1];
                int gameTA = Integer.valueOf(parts[2]);
                int gameTB = Integer.valueOf(parts[3]);
                Teams.add(new Play(teamA,teamB,gameTA,gameTB));
                
            }
        } catch (IOException ex) {
            Logger.getLogger(SportStatistics.class.getName()).log(Level.SEVERE, null, ex);
        }
        int gamesp=0;
        int wins=0;
        int losses=0;
       for(Play play:Teams){
            if(play.getTeamA().equals(teamname)){
                gamesp+=1;
                if(play.getGameTA()<play.getGameTB()){
                    losses+=1;
                }else{
                    wins+=1;
                }
            }else if(play.getTeamB().equals(teamname)){
                gamesp+=1;
                if(play.getGameTB()<play.getGameTA()){
                    losses+=1;
                }else{
                    wins+=1;
                }
            }
            
        }
        System.out.println("Games: "+ gamesp);
        System.out.println("Wins: "+ wins);
        System.out.println("Losses: "+losses);
    }

    private static class Play {

        private String TeamA;
        private String TeamB;
        private int GameTA;
        private int GameTB;

        public Play(String TeamA, String TeamB, int GameTA, int GameTB) {
            this.TeamA = TeamA;
            this.TeamB = TeamB;
            this.GameTA = GameTA;
            this.GameTB = GameTB;
        }

        public String getTeamA() {
            return TeamA;
        }

        public void setTeamA(String TeamA) {
            this.TeamA = TeamA;
        }

        public String getTeamB() {
            return TeamB;
        }

        public void setTeamB(String TeamB) {
            this.TeamB = TeamB;
        }

        public int getGameTA() {
            return GameTA;
        }

        public void setGameTA(int GameTA) {
            this.GameTA = GameTA;
        }

        public int getGameTB() {
            return GameTB;
        }

        public void setGameTB(int GameTB) {
            this.GameTB = GameTB;
        }
    }

}
