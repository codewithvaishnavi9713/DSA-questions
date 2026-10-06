public class root {
    int floorsqrt(int n) {
        int root=0;
        for(int i=1;i<=n;i++){
            root=i;
            if(i*i==n)break;
        }
        return root;
    }
    
}
