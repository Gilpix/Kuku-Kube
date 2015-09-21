package com.gilpix.kuku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Home extends Activity {
	
	
	FrameLayout frame;
	 LinearLayout startl,resultl,ll1,ll2,ll3,ll4,ll5,ll6,ll7,ll8,ll9,ll10,ll11,ll12,ll13,ll14;
	 Button  start,replay,ba1,bb2,bc3,bd4,be1,bf1,bg1,bh1,bi1,bj1;
	 //ImageView start; 
	 public int count=0,res;
	 
	 /////Timer
     TextView timer_act,result,current_score,kuku_kube; 
     private CountDownTimer mCountDown;
     long  currentTime;
	
	
	
	@Override 
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		
		
		frame= (FrameLayout)findViewById(R.id.frame);
		startl= (LinearLayout) findViewById(R.id.startl);
		resultl= (LinearLayout) findViewById(R.id.resultl);
		timer_act = (TextView) findViewById(R.id.timer_act);
		current_score = (TextView) findViewById(R.id.score);
		kuku_kube = (TextView) findViewById(R.id.kukukube);
		result = (TextView) findViewById(R.id.result);
		ll1= (LinearLayout) findViewById(R.id.ll1);// change id here
		 ll2= (LinearLayout) findViewById(R.id.ll2);// change id here
		 ll3= (LinearLayout) findViewById(R.id.ll3);
		 ll4= (LinearLayout) findViewById(R.id.ll4);
		 ll5= (LinearLayout) findViewById(R.id.ll5);
		 ll6= (LinearLayout) findViewById(R.id.ll6);
		 ll7= (LinearLayout) findViewById(R.id.ll7);
		 ll8= (LinearLayout) findViewById(R.id.ll8);
		 ll9= (LinearLayout) findViewById(R.id.ll9);
		 ll10= (LinearLayout) findViewById(R.id.ll10);
		 
		 
		 startl.setVisibility(View.VISIBLE);
		 resultl.setVisibility(View.INVISIBLE);
		 ll1.setVisibility(View.INVISIBLE);
		 ll2.setVisibility(View.INVISIBLE);
		 ll3.setVisibility(View.INVISIBLE);
		 ll4.setVisibility(View.INVISIBLE);
		 ll5.setVisibility(View.INVISIBLE);
		 ll6.setVisibility(View.INVISIBLE);
		 ll7.setVisibility(View.INVISIBLE);
		 ll8.setVisibility(View.INVISIBLE);
		 ll9.setVisibility(View.INVISIBLE);
		 ll10.setVisibility(View.INVISIBLE);
		 
		 
    	start = (Button)findViewById(R.id.start); 
    	replay = (Button)findViewById(R.id.replay); 
		ba1 = (Button)findViewById(R.id.ba1);
		bb2 = (Button)findViewById(R.id.bb2);
		bc3 = (Button)findViewById(R.id.bc3);
		bd4 = (Button)findViewById(R.id.bd4);
		be1 = (Button)findViewById(R.id.be1);
		bf1 = (Button)findViewById(R.id.bf1);
		bg1 = (Button)findViewById(R.id.bg1); 
		bh1 = (Button)findViewById(R.id.bh1);
		bi1 = (Button)findViewById(R.id.bi1);
		bj1 = (Button)findViewById(R.id.bj1);
		
	count=1;
	res=count;
	 kuku_kube.setText("KUKU KUBE");
	
		 
	if(count==1){

		start.setOnClickListener(new OnClickListener() {
				
					@Override
					public void onClick(final View v) {
						// TODO Auto-generated method stub
						
						kuku_kube.setText("");
						mCountDown = new CountDownTimer(30000, 1000) 
						{
					        @Override
					        public void onFinish() {
					        	time_up(v);
					        	current_score.setText("");
					        	kuku_kube.setText("TIME UP!");
					        	timer_act.setText("");
					        	result.setText("Your Score : " + (res-2) );
					        	
					    		//timeUp(context);
					        }

					        @Override
					        public void onTick(long millisUntilFinished) {
					        
					        	currentTime =  millisUntilFinished/1000;
					        	TextView timer_act,title;
					 	       
					 	       timer_act= (TextView)findViewById(R.id.timer_act);
					 	    
					        	timer_act.setText( String.valueOf(millisUntilFinished / 1000) + " " + "sec"+" ");
					        }
					      }.start();
						
						
					
						
						startl.setVisibility(View.INVISIBLE);
						ll1.setVisibility(View.VISIBLE);
						 //ll2.setVisibility(View.VISIBLE);
						 //ll3.setVisibility(View.INVISIBLE);
						 //ll4.setVisibility(View.INVISIBLE); 
						 current_score.setText("Score " + (count-1) );
						count++;
						 res=count;
						
						 
						 if(count==2){
								ba1.setOnClickListener(new OnClickListener() {
									
									@Override
									public void onClick(final View v) {
										// TODO Auto-generated method stub
										ll1.setVisibility(View.INVISIBLE);
										 ll2.setVisibility(View.VISIBLE);
										 //ll3.setVisibility(View.VISIBLE);
										// ll4.setVisibility(View.INVISIBLE);
										 current_score.setText("Score " + (count-1) );
										 count++;
										 res=count;
										
										 
										 if(count==3){
												bb2.setOnClickListener(new OnClickListener() {
													
													@Override
													public void onClick(final View v) {
														// TODO Auto-generated method stub
														//ll1.setVisibility(View.INVISIBLE);
														 ll2.setVisibility(View.INVISIBLE);
														 ll3.setVisibility(View.VISIBLE);
														 //ll4.setVisibility(View.INVISIBLE);
														 current_score.setText("Score " + (count-1) );
														 count++;
											           res=count;
											          
											           if(count==4){
															bc3.setOnClickListener(new OnClickListener() {
																
																@Override
																public void onClick(final View v) {
																	// TODO Auto-generated method stub
																	//ll1.setVisibility(View.INVISIBLE);
																	 //ll2.setVisibility(View.INVISIBLE);
																	 ll3.setVisibility(View.INVISIBLE);
																	 ll4.setVisibility(View.VISIBLE);
																	 current_score.setText("Score " + (count-1) );
																	 count++;
																	 res=count;
																	
																	 if(count==5){
																			bd4.setOnClickListener(new OnClickListener() {
																				
																				@Override
																				public void onClick(final View v) {
																					// TODO Auto-generated method stub
																					//ll1.setVisibility(View.INVISIBLE);
																					 //ll2.setVisibility(View.INVISIBLE);
																					 ll4.setVisibility(View.INVISIBLE);
																					 ll5.setVisibility(View.VISIBLE);
																					 current_score.setText("Score " + (count-1) );
																					 count++;
																					 res=count;
																					
																					 if(count==6){
																							be1.setOnClickListener(new OnClickListener() {
																								
																								@Override
																								public void onClick(final View v) {
																									// TODO Auto-generated method stub
																									//ll1.setVisibility(View.INVISIBLE);
																									 //ll2.setVisibility(View.INVISIBLE);
																									 ll5.setVisibility(View.INVISIBLE);
																									 ll6.setVisibility(View.VISIBLE);
																									 current_score.setText("Score " + (count-1) );
																									 count++;
																									 res=count;
																									
																									 if(count==7){
																											bf1.setOnClickListener(new OnClickListener() {
																												
																												@Override
																												public void onClick(final View v) {
																													// TODO Auto-generated method stub
																													//ll1.setVisibility(View.INVISIBLE);
																													 //ll2.setVisibility(View.INVISIBLE);
																													 ll6.setVisibility(View.INVISIBLE);
																													 ll7.setVisibility(View.VISIBLE);
																													 current_score.setText("Score " + (count-1) );
																													 count++;
																													 res=count;
																													 
																													 if(count==8){
																															bg1.setOnClickListener(new OnClickListener() {
																																
																																@Override
																																public void onClick(final View v) {
																																	// TODO Auto-generated method stub
																																	//ll1.setVisibility(View.INVISIBLE);
																																	 //ll2.setVisibility(View.INVISIBLE);
																																	 ll7.setVisibility(View.INVISIBLE);
																																	 ll8.setVisibility(View.VISIBLE);
																																	 current_score.setText("Score " + (count-1) );
																																	 count++;
																																	 res=count;
																																	
																																	 if(count==9){
																																			bh1.setOnClickListener(new OnClickListener() {
																																				
																																				@Override
																																				public void onClick(final View v) {
																																					// TODO Auto-generated method stub
																																					//ll1.setVisibility(View.INVISIBLE);
																																					 //ll2.setVisibility(View.INVISIBLE);
																																					 ll8.setVisibility(View.INVISIBLE);
																																					 ll9.setVisibility(View.VISIBLE);
																																					 current_score.setText("Score " + (count-1) );
																																					 count++;
																																					 res=count;
																																					 
																																					 if(count==10){
																																							bi1.setOnClickListener(new OnClickListener() {
																																								
																																								@Override
																																								public void onClick(final View v) {
																																									// TODO Auto-generated method stub
																																									//ll1.setVisibility(View.INVISIBLE);
																																									 //ll2.setVisibility(View.INVISIBLE);
																																									 ll9.setVisibility(View.INVISIBLE);
																																									 ll10.setVisibility(View.VISIBLE);
																																									 current_score.setText("Score " + (count-1) );
																																									 count++;
																																									 res=count;
																																									 if(count==11){
																																											bj1.setOnClickListener(new OnClickListener() {
																																												
																																												@Override
																																												public void onClick(final View v) {
																																													// TODO Auto-generated method stub
																																													//ll1.setVisibility(View.INVISIBLE);
																																													 //ll2.setVisibility(View.INVISIBLE);
																																													 ll10.setVisibility(View.INVISIBLE);
																																													 current_score.setText("");
																																													 resultl.setVisibility(View.VISIBLE);
																																										             cancelTimer();
																																										             
																																										      }});
																																										} 
																																						      }});
																																						}
																																		      }});
																																		}			 
																														      }});
																														}	 
																										      }});
																										}
																						      }});
																						}
																		      }});
																		}
														      }});
														}
														 
														 
											      }});
											}
							
							      }});
							}
						 
			
			      }});
	}
		 
	
	replay.setOnClickListener(new OnClickListener() {
		
		 public void onClick(View v) {
	           
	            //START YOUR ACTIVITY HERE AS  
	             Intent intent = new Intent(Home.this,Home.class);
	             startActivity(intent);
	             finish();
	        }
});
	
	
	
	
	
	
	
	
	
		
		
	}
	
	

	void cancelTimer() {
		mCountDown.cancel();
		result.setText("Your Score : "+ (count-1));
		timer_act.setText("");
		}
	 
	 private void time_up(View view) {
		   {
		   		
					 long time = currentTime;
						String timer_time = Long.toString(time);
						
					
					 cancelTimer();
					 startl.setVisibility(View.INVISIBLE);
					 ll1.setVisibility(View.INVISIBLE);
					 ll2.setVisibility(View.INVISIBLE);
					 ll3.setVisibility(View.INVISIBLE);
					 ll4.setVisibility(View.INVISIBLE);
					 ll5.setVisibility(View.INVISIBLE);
					 ll6.setVisibility(View.INVISIBLE);
					 ll7.setVisibility(View.INVISIBLE);
					 ll8.setVisibility(View.INVISIBLE);
					 ll9.setVisibility(View.INVISIBLE);
					 ll10.setVisibility(View.INVISIBLE);
					 
					 resultl.setVisibility(View.VISIBLE);
					 	
				
		   }
		   		
		   }
	 

	
	
	
	
	
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

}
