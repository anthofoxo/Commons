package cc.antho.common.color;

public class Color {

	public float r, g, b, a = 1f;

	public Color(Color color) {

		set(color);

	}

	public Color() {

		set(0F, 0F, 0F, 1f);

	}

	public Color(float r, float g, float b, float a) {

		set(r, g, b, a);

	}

	public Color(int hex) {

		set(((hex) & 0xFF0000) >> 16, ((hex) & 0xFF00) >> 8, ((hex) & 0xFF));

	}

	public Color(float r, float g, float b) {

		set(r, g, b);

	}

	public void set(Color color) {

		set(color.r, color.g, color.b, color.a);

	}

	public void set(float r, float g, float b, float a) {

		this.r = r;
		this.g = g;
		this.b = b;
		this.a = a;

	}

	public void set(float r, float g, float b) {

		this.r = r;
		this.g = g;
		this.b = b;

	}

	public void set(int r, int g, int b) {

		this.r = r / 255F;
		this.g = g / 255F;
		this.b = b / 255F;

	}

	public Color mul(float scalar) {

		r *= scalar;
		g *= scalar;
		b *= scalar;
		a *= scalar;

		return this;

	}

}
