package designPatterns.behaviourPattern.observerPattern;

public class QaTeam  implements Observer {

	private WebsiteStatus status;
	
	public final static String TEAM_NAME = "QA Team";
	
	public void notifyChange(WebsiteStatus status) {
		this.status = status;
		System.out.println("\n"+ TEAM_NAME + ":");
		checkWebsiteBuild();
	}

	private void checkWebsiteBuild() {
		switch(this.status) {
		case DOWN:
			System.out.println("We noticed something strange, we will report the issue to dev team");
			break;
		case UP:
			System.out.println("Everything is normal");
			break;
		case DEPLOYMENT_IN_PROGRESS:
			System.out.println("We need to run a sanity test to make sure all the features are working fine");
			break;
		default:
			System.err.println("Unknown application state");
		}
	}

}
