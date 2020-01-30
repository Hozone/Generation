class Veterinario 
{
	
		public void curaAnimale(Animali a){

			if (a instanceof Cane)
			{

				System.out.println("terapia per cani");
			}
			if (a instanceof Gatto)
			{

				System.out.println("terapia per gatti");
			}
			if (a instanceof Gallina)
			{

				System.out.println("terapia per galline");
			}

		}


}
