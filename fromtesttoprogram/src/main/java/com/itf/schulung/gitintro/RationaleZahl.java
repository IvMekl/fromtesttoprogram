package com.itf.schulung.gitintro;

public class RationaleZahl {
	private int p;
	private int q;
	
	public RationaleZahl(int p, int q) {
		if(q == 0) {
			throw new IllegalArgumentException();
		}
		this.p = p;
		this.q = q;
		this.kuerze();
	}

	/**
	 * @return the p
	 */
	public int getP() {
		return p;
	}

	/**
	 * @param p the p to set
	 */
	public void setP(int p) {
		this.p = p;
	}

	/**
	 * @return the q
	 */
	public int getQ() {
		return q;
	}

	/**
	 * @param q the q to set
	 */
	public void setQ(int q) {
		this.q = q;
	}

	@Override
	public String toString() {
		return p + "/" + q;
	}
	
	public void kuerze() {
		int groesster = TeilerRechner.groessterGemeinsamer(TeilerRechner.getAlleTeiler(this.getP()), TeilerRechner.getAlleTeiler(this.getQ()));
		this.setP(this.getP()/groesster);
		this.setQ(this.getQ()/groesster);
	}
	
	
}
