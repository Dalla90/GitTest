class Person{
	private String fornavn;
	private String etternavn;
	private int alder;
	
	public Person(String fornavn, String etternavn, int alder){
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.alder = alder;
	}
	
	public String getFornavn(){
		return fornavn;
	}
	
	public String getEtternavn(){
		return etternavn;
	}
	
	public int getAlder(){
		return alder;
	}
	
	public void setFornavn(String nyttFornavn){
		fornavn = nyttFornavn;
	}
	
	public void setEtternavn(String nyttEtternavn){
		etternavn = nyttEtternavn;
	}
	
	public void setAlder(int nyAlder){
		alder = nyAlder;
	}
	
	public String toString(){
		return "Fornavn: " + getFornavn() + " Etternavn: " + getEtternavn() + " Alder: " + getAlder();
	}
}



class Test{
	public static void main(String[]args){
		
		String navn = "Christian Dalhaug";
		String[] navnene = navn.split(" ");
		String fornavn = "";
		String etternavn = "";
		int alder = 22;
		for(int i = 0; i < navnene.length; i++){
			if(i == navnene.length - 2){
				fornavn += navnene[i];
			}else if(i < navnene.length - 1){
				fornavn += navnene[i] + " ";
			}else{
				etternavn += navnene[i];
			}	
		}
		
		Person a = new Person(fornavn, etternavn, alder);
		System.out.println(a.toString());
		
	}
}