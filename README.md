# Criptografia MD5 com Jakarta REST  

## 📌 Descrição geral do projeto  
Este projeto Java implementa um serviço web simples usando Jakarta REST (JAX-RS) para gerar o hash MD5 de qualquer palavra fornecida. Foi desenvolvido como exercício em um curso de sistemas distribuídos, permitindo à usuária digitar uma palavra em uma interface web e receber de volta o valor MD5 correspondente.  

## ⚙️ Como funciona  
O serviço expõe um endpoint REST que recebe uma palavra (via caminho ou parâmetro na URL) e retorna o hash MD5.  
Internamente, a implementação utiliza a classe `java.security.MessageDigest` para calcular o MD5 da entrada:

```java
MessageDigest md = MessageDigest.getInstance("MD5");
byte[] theMD5digest = md.digest(texto.getBytes("UTF-8"));
```

Após calcular o hash, o valor é convertido para hexadecimal e enviado como resposta ao cliente. Assim, toda vez que o endpoint for acessado com uma palavra, a resposta será o hash MD5 dessa palavra.

## 🛠️ Tecnologias utilizadas
- Java
- Jakarta REST (JAX-RS)
- HTML/CSS
- JavaScript

## 🚀 Instruções de uso

1. Clone este repositório em sua máquina local.
2. Abra o projeto em sua IDE Java favorita.
3. Configure e execute em um servidor Jakarta EE local, como Apache TomEE ou Payara Server.
4. Com o servidor rodando (por exemplo, em http://localhost:8080/), acesse a página web oferecida ou chame o endpoint REST:
    - Via navegador: entre em http://localhost:8080/ (ou na rota configurada) e use o formulário da interface.
    - Via terminal ou cliente HTTP: faça uma requisição GET diretamente ao endpoint.
  
## 📄 Exemplo de requisição

Usando curl:
```curl
curl -X GET http://localhost:8080/api/md5/test
```
Resposta esperada (hash MD5 da palavra "test"):
``` 
098f6bcd4621d373cade4e832627b4f6
```

## ⚠️ Aviso

Este projeto é apenas para fins de estudo e demonstração.
O MD5 apresenta vulnerabilidades conhecidas e não é recomendado para aplicações que exigem segurança real.
