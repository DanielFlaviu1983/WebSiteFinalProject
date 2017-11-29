<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/views/template/homeHeader.jsp"%>

<header>
    <div class="header-content">
        <div class="header-content-inner">
            <h1 id="homeHeading">Welcome to website Online Store</h1>
            <hr>
            <p>We are always stay-connecting with all customers!</p>
            <a href="#about" class="btn btn-primary btn-xl page-scroll sr-button">To Know What We've Provided here!</a>
        </div>
    </div>
</header>

<section class="bg-primary" id="about">
    <div class="container">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2 text-center">
                <h2 class="section-heading">We've got what you need!</h2>
                <hr class="light">
                <p class="text-faded">wWe are always stay-connecting with all customers!</p>
                <p class="text-faded">
                    We are always stay-connecting with all customers
                </p>
                <a href="#contact" class="page-scroll btn btn-info btn-xl sr-button">Contact with Us</a>
                <a href="<c:url value="/product/productList/"/>" class="page-scroll btn btn-default btn-xl sr-button">Go to products!</a>
            </div>
        </div>
    </div>
</section>
<%@include file="/WEB-INF/views/template/footer.jsp"%>