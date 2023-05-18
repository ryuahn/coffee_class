package reporter;

public class VideoReporterble implements Repotrable{

	@Override
	public void report() {
		System.out.println("직전 30초영상과 함께 신고를 진행합니다.");
	}

}
