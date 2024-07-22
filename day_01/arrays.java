package day_01;

import java.util.*;

public class arrays {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[5];
    
    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;
    arr[3] = 40;
    arr[4] = 50;

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    // for (int i = 0; i < arr.length; i++) {
    //   System.out.println(arr[i] + " ");
    // }
    System.out.println(Arrays.toString(arr));
  }
}


//

# python file

from flask import Flask

app = Flask(__name__)
@app.route('/')
def hello():
    return "Hello world"

app.run(host='0.0.0.0',port=5000)    


# Dockerfile

FROM python

WORKDIR /src/
COPY app.py/src/

RUN pip install flask

ENTRYPOINT ["Python", "app.py"]



# In Terminal

1. docker ps

2. docker image build -t myhello .

3. docker container run -p 9000:5000 myhello

4. docker image tag myhello darshithv3392/myhello

5. docker image push darshithv3392/myhello

6. kubectl run dars --image=darshithv3392/myhello --port=9000 --labels app=demo

7. kubectl port -forward pod/dars 9000:5000

8. kubectl get pods --selector app=demo


'''
//