package dynamic_beat_11;

import java.awt.*;

import javax.swing.*;

public class Game extends Thread { // 스레드를 상속받을 수 있게 한다. 스레드란 하나의 프로그램안에서 실행되는 작은 프로그램
	
	private Image noteBasicImage = new ImageIcon(Main.class.getResource("../images/noteBasic.png"))
			.getImage(); // 기본 노트모양
	private Image noteRouteLineImage = new ImageIcon(Main.class.getResource("../images/noteRouteLine.png"))
			.getImage(); // 노트내려오는 라인을 감싸는 라인
	private Image judgementLineImage = new ImageIcon(Main.class.getResource("../images/judgementLine.png"))
			.getImage(); // 눌리는 라인
	private Image gameInfoImage = new ImageIcon(Main.class.getResource("../images/gameInfo.png"))
			.getImage(); // 아래 선
	private Image noteRouteAImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png"))
			.getImage(); // 노트내려오는 라인
	private Image noteRouteSImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png"))
			.getImage();
	private Image noteRouteDImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png"))
			.getImage();
	private Image noteRouteF1Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png"))
			.getImage();
	private Image noteRouteF2Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png"))
			.getImage(); // F 쪽 노트라인이 다른 라인길이보다 2배 길기 때문
	private Image noteRouteJImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png"))
			.getImage();
	private Image noteRouteKImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png"))
			.getImage();
	private Image noteRouteLImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png"))
			.getImage();

	
	public void screenDraw(Graphics2D g) {
		g.drawImage(noteRouteAImage, 228, 30, null);
		g.drawImage(noteRouteSImage, 332, 30, null);
		g.drawImage(noteRouteDImage, 436, 30, null);
		g.drawImage(noteRouteF1Image, 540, 30, null);
		g.drawImage(noteRouteF2Image, 640, 30, null);
		g.drawImage(noteRouteJImage, 744, 30, null);
		g.drawImage(noteRouteKImage, 848, 30, null);
		g.drawImage(noteRouteLImage, 952, 30, null);
		g.drawImage(noteRouteLineImage, 224, 30, null);
		g.drawImage(noteRouteLineImage, 328, 30, null);
		g.drawImage(noteRouteLineImage, 432, 30, null);
		g.drawImage(noteRouteLineImage, 536, 30, null);
		g.drawImage(noteRouteLineImage, 740, 30, null);
		g.drawImage(noteRouteLineImage, 844, 30, null);
		g.drawImage(noteRouteLineImage, 948, 30, null);
		g.drawImage(noteRouteLineImage, 1052, 30, null);
		g.drawImage(noteBasicImage, 228, 70, null);			// 테스트
		g.drawImage(gameInfoImage, 0, 660, null);
		g.drawImage(judgementLineImage, 0, 580, null);		
		g.setColor(Color.white);
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		// 글자가 깨지는걸 방지하기위한 안티앨리어싱
		g.setFont(new Font("Arial", Font.BOLD, 30)); // Arial 글씨체로 진하게 크기 30으로
		g.drawString("Aimer - Strdust", 20, 702);
		g.drawString("Easy", 1190, 700);
		g.setFont(new Font("Arial", Font.PLAIN, 26));
		g.setColor(Color.DARK_GRAY);
		g.drawString("A", 270, 609);
		g.drawString("S", 374, 609);			
		g.drawString("D", 478, 609);		
		g.drawString("F", 631, 609);		
		g.drawString("J", 784, 609);		
		g.drawString("K", 889, 609);		
		g.drawString("L", 993, 609);		
		g.setColor(Color.LIGHT_GRAY);
		g.setFont(new Font("Elephant", Font.BOLD, 30));
		g.drawString("score0000", 565, 710);
		// 대충 위치조절해놨음 참고!
	}
	// 키보드를 눌렀을 때
	public void pressA() {
		noteRouteAImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png"))
				.getImage();
		// new Music("000.mp3", false).start(); 라고 원래는 키 입력시 넣어야되는 음이 있으나 필자는 넣지 않았다. (11강 11분) 나중에 지워버릴거다.
		
	}
	public void pressS() {
		noteRouteSImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png"))
				.getImage();
	}
	public void pressD() {
		noteRouteDImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png"))
				.getImage();
	}
	public void pressF() {
		noteRouteF1Image = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png"))
				.getImage();
		noteRouteF2Image = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png"))
				.getImage();
	}
	public void pressJ() {
		noteRouteJImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png"))
				.getImage();
	}
	public void pressK() {
		noteRouteKImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png"))
				.getImage();
	}
	public void pressL() {
		noteRouteLImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png"))
				.getImage();
	}
	
	// 키보드를 땠을 때
	public void releaseA() {
		noteRouteAImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png"))
				.getImage();
	}
	public void releaseS() {
		noteRouteSImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png"))
				.getImage();
	}
	public void releaseD() {
		noteRouteDImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png"))
				.getImage();
	}
	public void releaseF() {
		noteRouteF1Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png"))
				.getImage();
		noteRouteF2Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png"))
				.getImage();
	}
	public void releaseJ() {
		noteRouteJImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png"))
				.getImage();
	}
	public void releaseK() {
		noteRouteKImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png"))
				.getImage();
	}
	public void releaseL() {
		noteRouteLImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png"))
				.getImage();
	}
	
	@Override
	public void run() {
		
	}
}
