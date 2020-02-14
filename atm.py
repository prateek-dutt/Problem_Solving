
class ATM:

    def __init__(self,i1,i2,i3,i4):
        self.withdraw_amt=i4
        self.hundred_note=i3
        self.five_note=i2
        self.thous_note=i1
        self.present_cash = (self.thous_note * 1000) + (self.five_note * 500) + (self.hundred_note * 100)
        print(self.withdraw_amt)
        print(self.present_cash)
        def check_denom():
            if(self.hundred_note is 0):
                print("Enter in the multiples of 500")
            if(self.hundred_note is 0 and self.five_note is 0):
                print("Enter in the multiple of 1000")
            else:
                return True
        def check_current_cash():
            if self.present_cash<self.withdraw_amt:
                return  False
            else:
                return True
        def check_correct_amount():
            if self.withdraw_amt%100 is 0:
               return True



            else:
                print("Please Enter In Multiples of 100,500,or 1000")




        if check_current_cash() and check_correct_amount() and check_denom():
            print("*******************ATM STARTED***************************")
            ##considering all the notes are present in the atm
            if(self.withdraw_amt>100):
               if self.withdraw_amt<500:
                    if self.hundred_note>= self.withdraw_amt%100:
                        print("100 *",self.withdraw_amt/100)
                    else:
                        print("Please Enter in the multiples of 500")
                   
                       
               if self.withdraw_amt>=500 and self.withdraw_amt<1000:
                  if self.five_note>=1:
                      if self.withdraw_amt % 500 is 0:
                          print("500 *1")
                      else:
                        rem_amt=self.withdraw_amt%500
                        print("500 *1", end= " , ")
                        print("100 *",rem_amt/100)
                  else:
                      print("Machine Halts")
               if self.withdraw_amt==1000:
                       #check if we have a thousand rupee note
                  if(self.thous_note>=1):
                      print("1000 *1 ")
                  else:
                      print("Machine Halts")

               if self.withdraw_amt>1000 and self.withdraw_amt%1000==0:
                   ##ideally we will try to break it in thousands, if enough thousand note is
                    #not available we will get minimum amount we  can reach through thousand and min
                    #amount of five notes that we will need to complete if enough five notes are not available
                    #then we will try for making the left amount through hundred
                    if self.thous_note>=self.withdraw_amt/1000:
                        print("1000 *",self.withdraw_amt/1000)
                    else:
                        req_amt=self.withdraw_amt-(self.thous_note*1000)
                        if self.five_note>=req_amt/500:
                            print("1000*",self.thous_note,end=" , ")
                            print("500 *",req_amt/500)
                        else:
                            req_hun=req_amt-(self.five_note*500)
                            print("1000 *",self.thous_note,end="  , ")
                            print("500 *",self.five_note,end=" , ")
                            print("100 *",req_hun/100)
               if self.withdraw_amt>1000 and self.withdraw_amt%1000!=0:
                   rem_amt=self.withdraw_amt%1000
                   if self.thous_note>=round(self.withdraw_amt/1000):
                       print("1000 *",round(self.withdraw_amt/1000),end=" , ")
                       if rem_amt<500:
                           print("100 *",round(rem_amt/100))
                       else:
                           if rem_amt%500 ==0:
                               print("500 *1")
                           else:
                               print("500 *1",end= " ,")
                               print("100 *",(rem_amt-500)/100)
                   else:
                       thou_remaining=self.withdraw_amt-(self.thous_note*1000)
                       if self.five_note>=thou_remaining/500:
                           print("1000 *",self.thous_note,end= " , ")
                           print("500 *",self.withdraw_amt/500)
                       else:
                           hun_rem=thou_remaining-(self.five_note *500)
                           print("1000 *",self.thous_note,end=" , ")
                           print("500 *",self.five_note,end= " ,")
                           print("100 *",hun_rem/100)



            else:
                 print("100 *",1)
    
                    

def main():
    amt=int(input("Enter the withdrawal amount"))
    atm=ATM(10,10,10,amt)


    print("THANK YOU ")
    
main()





