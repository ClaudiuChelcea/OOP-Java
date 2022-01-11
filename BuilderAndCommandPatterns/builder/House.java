package BuilderAndCommandPatterns.builder;

import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;

public class House {
	String location = "";
	int nr_floors = 0;
	int nr_rooms;
	String outside_color = "";
	Boolean pool = false;
	Boolean twentyfoursevensecurity = false;

	public House(String location, int nr_floors, int nr_rooms, String outside_color, Boolean pool, Boolean twentyfoursevensecurity) {
		this.location = location;
		this.nr_floors = nr_floors;
		this.nr_rooms = nr_rooms;
		this.outside_color = outside_color;
		this.pool = pool;
		this.twentyfoursevensecurity = twentyfoursevensecurity;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNr_floors() {
		return nr_floors;
	}

	public void setNr_floors(int nr_floors) {
		this.nr_floors = nr_floors;
	}

	public int getNr_rooms() {
		return nr_rooms;
	}

	public void setNr_rooms(int nr_rooms) {
		this.nr_rooms = nr_rooms;
	}

	public String getOutside_color() {
		return outside_color;
	}

	public void setOutside_color(String outside_color) {
		this.outside_color = outside_color;
	}

	public Boolean getPool() {
		return pool;
	}

	public void setPool(Boolean pool) {
		this.pool = pool;
	}

	public Boolean getTwentyfoursevensecurity() {
		return twentyfoursevensecurity;
	}

	public void setTwentyfoursevensecurity(Boolean twentyfoursevensecurity) {
		this.twentyfoursevensecurity = twentyfoursevensecurity;
	}

	private House(HouseBuilder builder) {
		this.location = builder.location;
		this.nr_floors = builder.nr_floors;
		this.nr_rooms = builder.nr_rooms;
		this.outside_color = builder.outside_color;
		this.pool = builder.pool;
		this.twentyfoursevensecurity = builder.twentyfoursevensecurity;
	}

	@Override
	public String toString() {
		return "House{" +
				"location='" + location + '\'' +
				", nr_floors=" + nr_floors +
				", nr_rooms=" + nr_rooms +
				", outside_color='" + outside_color + '\'' +
				", pool=" + pool +
				", twentyfoursevensecurity=" + twentyfoursevensecurity +
				'}';
	}

	public static class HouseBuilder {
		String location = "";
		int nr_floors = 0;
		int nr_rooms;
		String outside_color = "";
		Boolean pool = false;
		Boolean twentyfoursevensecurity = false;

		HouseBuilder() {}

		public HouseBuilder(String location, int nr_floors, int nr_rooms) {
			this.location = location;
			this.nr_floors = nr_floors;
			this.nr_rooms = nr_rooms;

		}

		HouseBuilder setOutside_color(String outside_color) {
			this.outside_color = outside_color;
			return this;
		}

		HouseBuilder setPool(Boolean pool) {
			this.pool = pool;
			return this;
		}

		HouseBuilder setTwentyfoursevensecurity(Boolean security) {
			this.twentyfoursevensecurity = security;
			return this;
		}

		public House build() {

			return new House(this.location, this.nr_floors, this.nr_rooms, this.outside_color, this.pool, this.twentyfoursevensecurity);
		}

		public static void main(String[] args) {
			House house = new HouseBuilder("Iuliu Maniu nr 25", 15, 3).setPool(false).setOutside_color("Green").setTwentyfoursevensecurity(true).build();
			System.out.println(house);

			House house1 = new HouseBuilder().setOutside_color("white").setPool(true).setTwentyfoursevensecurity(false).build();
			System.out.println(house1);
		}
	}
}
