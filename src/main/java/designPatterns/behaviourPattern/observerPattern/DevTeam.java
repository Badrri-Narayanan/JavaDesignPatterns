package designPatterns.behaviourPattern.observerPattern;

public class DevTeam implements Observer {

	private WebsiteStatus status;
	
	public final static String TEAM_NAME = "DEV Team";
	
	public void notifyChange(WebsiteStatus status) {
		this.status = status;
		System.out.println("\n"+ TEAM_NAME + ":");
		checkWebsiteBuild();
	}

	private void checkWebsiteBuild() {
		switch(this.status) {
		case DOWN:
			System.out.println("We are investigating the root cause");
			break;
		case UP:
			System.out.println("Everything is normal");
			break;
		case DEPLOYMENT_IN_PROGRESS:
			System.out.println("We have deployed a new build and we need to verify all the changes look good");
			break;
		default:
			System.err.println("Unknown application state");
		}
	}

}
