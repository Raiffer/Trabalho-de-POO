class Usuario{
    private String nome, dataNascimento, email, senha;
    private int telefone, cpf, cep;
    
    public String getnome(){
        return this.nome;
    }
    
    public int gettelefone(){
        return this.telefone;
    }
    
    public int getcpf(){
        return this.cpf;
    }
    
    public int getcep(){
        return this.cep;   
    }
    
    public String getdataNascimento(){
        return this.dataNascimento;
    }
    
    public String getemail(){
        return this.email;
    }
    
    public String getsenha(){
        return this.senha;
    }
    
    public void setnome(String nome){
        this.nome = nome;
    }
    
    public void settelefone(int telefone){
        this.telefone = telefone;
    }
    
    public void setcpf(int cpf){
        this.cpf = cpf;
    }
    
    public void setcep(int cep){
        this.cep = cep;
    }
    
    public void setdataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public void setemail(String email){
        this.email = email;
    }
    
    public void setsenha(String senha){
        this.senha = senha;
    }
    
}

class Organizador{
    private int idOrganizador, orsamento, gastos, telefone, cpf, cep;
    private String nome, dataNascimento,email, senha;
    
    public int getidOrganizador(){
        return this.idOrganizador;
    }
    
    public int getorsamento(){
        return this.orsamento;
    }
    
    public int getgastos(){
        return this.gastos;
    }
    
    public int gettelefone(){
        return this.telefone;
    }
    
    public int getcpf(){
        return this.cpf;
    }
    
    public int getcep(){
        return this.cep;
    }
    
    public String getnome(){
        return this.nome;
    }
    
    public String getdataNascimento(){
        return this.dataNascimento;
    }
    
    public String getemail(){
        return this.email;
    }
    
    public String getsenha(){
        return this.senha;
    }
    
    public void setidOrganizador(int idOrganizador){
        this.idOrganizador = idOrganizador;
    } 
    
    public void setorsamento(int orsamento){
        this.orsamento = orsamento;
    }
    
    public void setgastos(int gastos){
        this.gastos = gastos;
    }
    
    public void settelefone(int telefone){
        this.telefone = telefone;
    }
    
    public void setcpf(int cpf){
        this.cpf = cpf;
    }
    
    public void setcep(int cep){
        this.cep = cep;
    }
    
    public void setnome(String nome){
        this.nome = nome;
    }
    
    public void setdataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public void setemail(String email){
        this.email = email;
    }
    
    public void setsenha(String senha){
        this.senha = senha;
    }
    
    public void cadastrarEvento(){
        
    }
    
    public void cancelarEvento(){
        
    }
}    

class Participante{
    
    private int idParticipante, telefone, cpf, cep;
    private String nome, dataNascimento, email, senha;
    public double notaEvento;
    
    public int getidParticipante(){
        return this.idParticipante;
    }

    public double getnotaEvento(){
        return this.notaEvento;
    }

    public int gettelefone(){
        return this.telefone;
    }
    
    public int getcpf(){
        return this.cpf;
    }
    
    public int getcep(){
        return this.cep;
    }
    
    public String getnome(){
        return this.nome;
    }
    
    public String getdataNascimento(){
        return this.dataNascimento;
    }
    
    public String getemail(){
        return this.email;
    }
    
    public String getsenha(){
        return this.senha;
    }

    public void setidParticipante(int idParticipante){
        this.idParticipante = idParticipante;
    } 
    
    public void setnome(String nome){
        this.nome = nome;
    }
    
    public void settelefone(int telefone){
        this.telefone = telefone;
    }
    
    public void setcpf(int cpf){
        this.cpf = cpf;
    }
    
    public void setcep(int cep){
        this.cep = cep;
    }
    
    public void setdataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public void setemail(String email){
        this.email = email;
    }
    
    public void setsenha(String senha){
        this.senha = senha;
    }
    
    public void setnotaEvento(double notaEvento){
        this.notaEvento = notaEvento;
    }
    
    
}

class Palestrante{
    private int idPalestrante, telefone, cpf, cep;
    private String nome, dataNascimento, email, senha;
    
    private int getidPalestrante(){
        
    }
    
    private int gettelefone(){
        
    }
    
    private int getcpf(){
        
    }
    
    private int getcep(){
        
    }
    
    private String getnome(){
        
    }
    
    private String getdataNascimento(){
        
    }
    
    private String getemail(){
        
    }
    
    private String getsenha(){
        
    }
    
    private void setidPalestrante(){
        
    } 
    
    private void setorsamento(){
        
    }
    
    private void setgastos(){
        
    }
    
    private void settelefone(){
        
    }
    
    private void setcpf(){
        
    }
    
    private void setcep(){
        
    }
    
    private void setnome(){
        
    }
    
    private void setdataNascimento(){
        
    }
    
    private void setemail(){
        
    }
    
    private void setsenha(){
        
    }
    
    
}

class Evento{
    String data, nome, hora;
    int limiteParticipante, valor;
    
    private String getdata(){
        
    }
    
    private String getnome(){
        
    }
    
    private String gethora(){
        
    }
    
    private int getlimiteParticipantes(){
        
    }
    
    private int getvalor(){
        
    }
    
    private void setdata(){
        
    }
    
    private void setnome(){
        
    }
    
    private void sethora(){
        
    }
    
    private void setlimiteParticipantes(){
        
    }
    
    private void setvalor(){
        
    }
    
    public void criarAtividade(){
        
    }
    
    public void removerAtividade(){
        
    }
    
    public void enviarEmail(){
        
    }
}
