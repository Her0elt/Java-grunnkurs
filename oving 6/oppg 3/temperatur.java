class temperatur{
	double [][]temp={{2,13,4,12,12},{13,2,-8,4,-6}};
	public void dsnitt(){
		double []dSnitt=new double[temp.length];
    	for (int i = 0; i < temp.length; ++i) {
			for(int j = 0; j < temp[i].length; ++j){
				dSnitt[i]+=temp[i][j];
		     }
		}
		double []fullSnitt=new double[dSnitt.length];
		for(int t=0;t<dSnitt.length;t++){
			System.out.println("gjennomsnittet for dag "+(t+1)+" i måneden er "+dSnitt[t]/temp[t].length);
		}
	}
	public void tsnitt(){
    	double []tSnitt=new double[temp[1].length];
		for (int r = 0; r < temp[1].length; r++){
			for(int b = 0; b < temp.length; b++){
				tSnitt[r]+=temp[b][r];
			}
		}
		for(int k=0;k<tSnitt.length;k++){
			System.out.println("gjennomsnittet for hver time i måneden er "+tSnitt[k]/temp.length+" for time "+(k+1));
		}
	}
	public void msnitt(){
		double mSnitt=0;
		double dager=temp.length;
		for (int i = 0; i < temp.length; ++i) {
			for(int j = 0; j < temp[i].length; ++j){
				mSnitt+=temp[i][j];
			}
		}
		System.out.println("gjennomsnittet for hele måneden er "+mSnitt/dager);
	}
	public void intervaller(){
		double []dSnitt=new double[temp.length];
		for (int i = 0; i < temp.length; ++i) {
			for(int j = 0; j < temp[i].length; ++j){
				dSnitt[i]+=temp[i][j];
			}
		}
		double []fullSnitt=new double[dSnitt.length];
		for(int t=0;t<dSnitt.length;t++){
			fullSnitt[t]=(dSnitt[t]/temp[t].length);
		}
		String[]intervaller={"under -5","mellom -5 og 0","mellom 0 og 5","mellom 5 og 10","over 10"};
		int teller[]=new int[5];
		for(int i=0;i<fullSnitt.length;i++){
			if(fullSnitt[i]<-5){
				teller[0]++;
			}
			else if(fullSnitt[i]>-5&&fullSnitt[i]<0){
				teller[1]++;
			}
			else if(fullSnitt[i]>0&&fullSnitt[i]<5){
				teller[2]++;
			}
			else if(fullSnitt[i]>5&&fullSnitt[i]<10){
				teller[3]++;
			}
			else if(fullSnitt[i]>10){
				teller[4]++;
			}
		}
			for(int t=0;t<teller.length;t++){
				if(teller[t]!=0){
					System.out.println("Det er "+teller[t]+" dager med gjennomsnitt "+intervaller[t]+" grader");
				}
			}

	}
}