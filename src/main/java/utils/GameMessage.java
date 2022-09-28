package utils;

public class GameMessage {
    public void getNumberMessage(){
        System.out.println("숫자를 입력해주세요 : ");
    }

    public void endGameMessage(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
    public void scoreMessage(int ball, int strike){
        if(ball>0 && strike>0){
            System.out.printf("%d볼 %d스트라이크%n",ball,strike);
        }
        if(ball>0 && strike==0){
            System.out.printf("%d볼%n",ball);
        }
        if(ball==0 && strike>0){
            System.out.printf("%d스트라이크%n",strike);
        }
        if(ball==0 && strike==0){
            System.out.println("낫싱");
        }
    }
}
