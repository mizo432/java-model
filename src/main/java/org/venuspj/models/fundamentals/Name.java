package org.venuspj.models.fundamentals;

public class Name {

	private String value;

	/**
	 * コンストラクター.
	 * @param value 名称
	 */
	protected Name(String value) {
		this.value = value;
	}

	/**
	 * 値を取得する
	 * @return 値を取得する
	 */
	public String getValue() {
	  return value;

	}

	/**
	 * Nameインスタンスを取得する
	 * @param value 名前
	 * @return valueの設定されたNameオブジェクト
	 */
	public static Name of(String value) {
		return  new Name(value);

	}

}
