import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;


public class ItemList implements Handler {
	
	public ItemList(Clothing[] items) {
		// TODO Auto-generated constructor stub
		this.items = items;
		}
	private Clothing[] items;
	
	public void accept(ServerRequest req, ServerResponse res) {
		res.status(Http.Status.OK_200);
		
		res.headers().put("Content-Type", "text/plain; charset=UTF-8");
		StringBuilder result = new StringBuilder();
		for (Clothing item : items) {
			result.append(item);
		}
		
		res.send(items.toString());
	}

}
