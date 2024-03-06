import java.util.List;
import java.util.Scanner;

public class KimbapGameRunner {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        KimbapGameRunner runner = new KimbapGameRunner();
        runner.startGame();
    }

    public void startGame() {
        System.out.println("김밥만들기 게임!");
        System.out.println("김밥을 만들어보아요!\n");

        while (true) {
            System.out.println("뭘 하고싶나요?");
            System.out.println("1. 김밥재료 보기");
            System.out.println("2. 김밥만들기");
            System.out.println("3. 만든 김밥들 보기");
            System.out.println("4. 김밥 재료 추가하기");
            System.out.println("5. 게임 종료");

            int choice = getIntInput("선택하세요!: ");

            switch (choice) {
                case 1:
                    viewIngredients();
                    break;
                case 2:
                    makeKimbap();
                    break;
                case 3:
                    System.out.println("게임을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 메뉴명입니다.");
            }
        }
    }

    private void viewIngredients() {
        
        System.out.println("김밥재료들을 보여드리겠습니다:");
        
    }

    private void makeKimbap() {
        
        System.out.println("김밥을 만들어요!");
        
        List<Ingredient> selectedIngredients = selectIngredientsForKimbap();
        String kimbapType = makeKimbap(selectedIngredients);

        System.out.println("축하합니다! 당신은" + kimbapType + " 김밥을 만드셨습니다!");
    }
    

    private List<Ingredient> selectIngredientsForKimbap() {
		
		return null;
	}

	private String makeKimbap(List<Ingredient> selectedIngredients) {
		
		return null;
	}

	private int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("잘못된 선택입니다 다시 입력해주세요! : ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}