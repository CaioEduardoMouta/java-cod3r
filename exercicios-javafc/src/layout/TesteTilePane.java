package layout;

import javafx.scene.layout.TilePane;
import java.util.List;
import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;

public class TesteTilePane extends TilePane{
	
	public TesteTilePane() {
		
		List<Quadrado> quadrados = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			quadrados.add(new Quadrado(i * 10));
		}
		
		setPadding(new Insets(20, 10, 20 , 10));
		setVgap(10);
		setHgap(10);
		
		setOrientation(Orientation.VERTICAL);
		setTileAlignment(Pos.BOTTOM_RIGHT);
		
		getChildren().addAll(quadrados);
	}

}
