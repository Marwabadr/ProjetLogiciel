<!DOCTYPE html>
<html lang="en">

<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>Majestic Admin</title>
  <!-- plugins:css -->
  <link rel="stylesheet" href="../../vendors/mdi/css/materialdesignicons.min.css">
  <link rel="stylesheet" href="../../vendors/base/vendor.bundle.base.css">
  <!-- endinject -->
  <!-- plugin css for this page -->
  <!-- End plugin css for this page -->
  <!-- inject:css -->
  <link rel="stylesheet" href="../../css/style.css">
  <!-- endinject -->
  <link rel="shortcut icon" href="../../images/favicon.png" />
</head>

<body>
  <div class="container-scroller">
    <!-- partial:../../partials/_navbar.html -->
    <nav class="navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
      <div class="navbar-brand-wrapper d-flex justify-content-center">
        <div class="navbar-brand-inner-wrapper d-flex justify-content-between align-items-center w-100">  
          <a class="navbar-brand brand-logo" href="../../index.html"><img src="../../images/logo.svg" alt="logo"/></a>
          <a class="navbar-brand brand-logo-mini" href="../../index.html"><img src="../../images/logo-mini.svg" alt="logo"/></a>
          <button class="navbar-toggler navbar-toggler align-self-center" type="button" data-toggle="minimize">
            <span class="mdi mdi-sort-variant"></span>
          </button>
        </div>  
      </div>
      <div class="navbar-menu-wrapper d-flex align-items-center justify-content-end">
        <ul class="navbar-nav mr-lg-4 w-100">
          <li class="nav-item nav-search d-none d-lg-block w-100">
            <div class="input-group">
              <div class="input-group-prepend">
                <span class="input-group-text" id="search">
                  <i class="mdi mdi-magnify"></i>
                </span>
              </div>
              <input type="text" class="form-control" placeholder="Search now" aria-label="search" aria-describedby="search">
            </div>
          </li>
        </ul>
        <ul class="navbar-nav navbar-nav-right">
          <li class="nav-item dropdown me-1">
            <a class="nav-link count-indicator dropdown-toggle d-flex justify-content-center align-items-center" id="messageDropdown" href="#" data-bs-toggle="dropdown">
              <i class="mdi mdi-message-text mx-0"></i>
              <span class="count"></span>
            </a>
            <div class="dropdown-menu dropdown-menu-right navbar-dropdown" aria-labelledby="messageDropdown">
              <p class="mb-0 font-weight-normal float-left dropdown-header">Messages</p>
              <a class="dropdown-item">
                <div class="item-thumbnail">
                    <img src="../../images/faces/face4.jpg" alt="image" class="profile-pic">
                </div>
                <div class="item-content flex-grow">
                  <h6 class="ellipsis font-weight-normal">David Grey
                  </h6>
                  <p class="font-weight-light small-text text-muted mb-0">
                    The meeting is cancelled
                  </p>
                </div>
              </a>
              <a class="dropdown-item">
                <div class="item-thumbnail">
                    <img src="../../images/faces/face2.jpg" alt="image" class="profile-pic">
                </div>
                <div class="item-content flex-grow">
                  <h6 class="ellipsis font-weight-normal">Tim Cook
                  </h6>
                  <p class="font-weight-light small-text text-muted mb-0">
                    New product launch
                  </p>
                </div>
              </a>
              <a class="dropdown-item">
                <div class="item-thumbnail">
                    <img src="../../images/faces/face3.jpg" alt="image" class="profile-pic">
                </div>
                <div class="item-content flex-grow">
                  <h6 class="ellipsis font-weight-normal"> Johnson
                  </h6>
                  <p class="font-weight-light small-text text-muted mb-0">
                    Upcoming board meeting
                  </p>
                </div>
              </a>
            </div>
          </li>
          <li class="nav-item dropdown me-4">
            <a class="nav-link count-indicator dropdown-toggle d-flex align-items-center justify-content-center notification-dropdown" id="notificationDropdown" href="#" data-bs-toggle="dropdown">
              <i class="mdi mdi-bell mx-0"></i>
              <span class="count"></span>
            </a>
            <div class="dropdown-menu dropdown-menu-right navbar-dropdown" aria-labelledby="notificationDropdown">
              <p class="mb-0 font-weight-normal float-left dropdown-header">Notifications</p>
              <a class="dropdown-item">
                <div class="item-thumbnail">
                  <div class="item-icon bg-success">
                    <i class="mdi mdi-information mx-0"></i>
                  </div>
                </div>
                <div class="item-content">
                  <h6 class="font-weight-normal">Application Error</h6>
                  <p class="font-weight-light small-text mb-0 text-muted">
                    Just now
                  </p>
                </div>
              </a>
              <a class="dropdown-item">
                <div class="item-thumbnail">
                  <div class="item-icon bg-warning">
                    <i class="mdi mdi-settings mx-0"></i>
                  </div>
                </div>
                <div class="item-content">
                  <h6 class="font-weight-normal">Settings</h6>
                  <p class="font-weight-light small-text mb-0 text-muted">
                    Private message
                  </p>
                </div>
              </a>
              <a class="dropdown-item">
                <div class="item-thumbnail">
                  <div class="item-icon bg-info">
                    <i class="mdi mdi-account-box mx-0"></i>
                  </div>
                </div>
                <div class="item-content">
                  <h6 class="font-weight-normal">New user registration</h6>
                  <p class="font-weight-light small-text mb-0 text-muted">
                    2 days ago
                  </p>
                </div>
              </a>
            </div>
          </li>
          <li class="nav-item nav-profile dropdown">
            <a class="nav-link dropdown-toggle" href="#" data-bs-toggle="dropdown" id="profileDropdown">
              <img src="../../images/faces/face5.jpg" alt="profile"/>
              <span class="nav-profile-name">Louis Barnett</span>
            </a>
            <div class="dropdown-menu dropdown-menu-right navbar-dropdown" aria-labelledby="profileDropdown">
              <a class="dropdown-item">
                <i class="mdi mdi-settings text-primary"></i>
                Settings
              </a>
              <a class="dropdown-item">
                <i class="mdi mdi-logout text-primary"></i>
                Logout
              </a>
            </div>
          </li>
        </ul>
        <button class="navbar-toggler navbar-toggler-right d-lg-none align-self-center" type="button" data-toggle="offcanvas">
          <span class="mdi mdi-menu"></span>
        </button>
      </div>
    </nav>
    <!-- partial -->
    <div class="container-fluid page-body-wrapper">
      <!-- partial:../../partials/_sidebar.html -->
      <nav class="sidebar sidebar-offcanvas" id="sidebar">
        <ul class="nav">
          <li class="nav-item">
            <a class="nav-link" href="../../index.html">
              <i class="mdi mdi-contact-mail menu-icon"></i>
              <span class="menu-title">Envoyer Besoin</span>
            </a>
          </li>

          <li class="nav-item">
            <a class="nav-link" href="../../pages/forms/basic_elements.html">
              <i class="mdi mdi-alert-circle menu-icon"></i>
              <span class="menu-title">Déclarer panne</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="../../pages/charts/chartjs.html">
              <i class="mdi mdi-logout-variant menu-icon"></i>
              <span class="menu-title">Déconnexion</span>
            </a>
          </li>

        </ul>
      </nav>
      <!-- partial -->
      <div class="main-panel">        
        <div class="content-wrapper">
          <div class="row">
            <div class="col-12 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <h4 class="card-title">Déclerer les besoins</h4>

                  <form class="forms-sample" action="/besoins/ajouter" method="post">
                    <div class="form-group">
                      <label for="besoin">Le besoin :</label>
                      <input type="text" class="form-control" id="besoin" name="description" placeholder="Le besoin">
                    </div>
                    <div class="form-group">
                      <label for="qte">La quantité :</label>
                      <input type="number" class="form-control" id="qte" name="quantite" placeholder="La quantité">
                    </div>
                    <div class="form-group">
                      <label class="d-block">Le type :</label>
                      <div class="form-check d-inline-block" style="margin-left: 20px;margin-right: 30px;">
                        <input class="form-check-input" type="radio" name="typeRessource" id="typeOrdinateur" value="ordinateur" checked>
                        <label class="form-check-label" for="typeOrdinateur">Ordinateur</label>
                      </div>
                      <div class="form-check d-inline-block" >
                        <input class="form-check-input" type="radio" name="typeRessource" id="typeImprimante" value="imprimante">
                        <label class="form-check-label" for="typeImprimante">Imprimante</label>
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="marque">La marque :</label>
                      <input type="text" class="form-control" id="marque" name="marque" placeholder="La marque">
                    </div>
                    <div class="form-group">
                      <label for="ram">La RAM :</label>
                      <input type="text" class="form-control" id="ram" name="ram" placeholder="La RAM">
                    </div>
                    <div class="form-group">
                      <label for="cpu">Le CPU :</label>
                      <input type="text" class="form-control" id="cpu" name="cpu" placeholder="Le CPU">
                    </div>
                    <div class="form-group">
                      <label for="disque">Le disque dur :</label>
                      <input type="text" class="form-control" id="disque" name="disqueDur" placeholder="Le disque dur">
                    </div>
                    <div class="form-group">
                      <label for="ecran">L'écran :</label>
                      <input type="text" class="form-control" id="ecran" name="ecran" placeholder="L'écran">
                    </div>
                    <div class="form-group" id="vitesseImpressionDiv" style="display: none;">
                      <label for="vitesseImpression">La vitesse d'impression :</label>
                      <input type="text" class="form-control" id="vitesseImpression" name="vitesseImpression" placeholder="Vitesse d'impression">
                    </div>
                    <div class="form-group" id="resolutionDiv" style="display: none;">
                      <label for="resolution">La résolution :</label>
                      <input type="text" class="form-control" id="resolution" name="resolution" placeholder="Résolution">
                    </div>
                    <div class="form-group" id="marqueIMDiv" style="display: none;">
                      <label for="marqueIM">La marque :</label>
                      <input type="text" class="form-control" id="marqueIM" name="marqueIM" placeholder="Marque">
                    </div>
                    <button type="submit" class="btn btn-primary me-2">Ajouter</button>
                    <button class="btn btn-light">Annuler</button>
                  </form>

                </div>
              </div>
            </div>



          </div>
        </div>
        <!-- content-wrapper ends -->
        <!-- partial:../../partials/_footer.html -->
        <footer class="footer">
        <div class="d-sm-flex justify-content-center justify-content-sm-between">

        </div>
        </footer>
        <!-- partial -->
      </div>
      <!-- main-panel ends -->
    </div>
    <!-- page-body-wrapper ends -->
  </div>
  <!-- container-scroller -->
  <!-- plugins:js -->
  <script>
    // Sélection des éléments du formulaire
    const typeImprimanteInput = document.getElementById('typeImprimante');
    const typeOrdinateurInput = document.getElementById('typeOrdinateur');
    const vitesseImpressionDiv = document.getElementById('vitesseImpressionDiv');
    const resolutionDiv = document.getElementById('resolutionDiv');
    const marqueIMDiv = document.getElementById('marqueIMDiv');

    // Ajout d'écouteurs d'événements sur les boutons radio
    typeImprimanteInput.addEventListener('change', function() {
      if (this.checked) {
        // Si l'imprimante est sélectionnée, afficher les champs de l'imprimante et masquer les champs de l'ordinateur
        vitesseImpressionDiv.style.display = 'block';
        resolutionDiv.style.display = 'block';
        marqueIMDiv.style.display = 'block';

        // Masquer les champs de l'ordinateur
        document.getElementById('marque').style.display = 'none';
        document.getElementById('ram').style.display = 'none';
        document.getElementById('cpu').style.display = 'none';
        document.getElementById('disque').style.display = 'none';
        document.getElementById('ecran').style.display = 'none';
        // Masquer les labels des champs de l'ordinateur
        document.querySelector('label[for="marque"]').style.display = 'none';
        document.querySelector('label[for="ram"]').style.display = 'none';
        document.querySelector('label[for="cpu"]').style.display = 'none';
        document.querySelector('label[for="disque"]').style.display = 'none';
        document.querySelector('label[for="ecran"]').style.display = 'none';
      }
    });

    typeOrdinateurInput.addEventListener('change', function() {
      if (this.checked) {
        // Si l'ordinateur est sélectionné, afficher les champs de l'ordinateur et masquer les champs de l'imprimante
        vitesseImpressionDiv.style.display = 'none';
        resolutionDiv.style.display = 'none';
        marqueIMDiv.style.display = 'none';

        // Afficher les champs de l'ordinateur
        document.getElementById('marque').style.display = 'block';
        document.getElementById('ram').style.display = 'block';
        document.getElementById('cpu').style.display = 'block';
        document.getElementById('disque').style.display = 'block';
        document.getElementById('ecran').style.display = 'block';
        // Afficher les labels des champs de l'ordinateur
        document.querySelector('label[for="marque"]').style.display = 'block';
        document.querySelector('label[for="ram"]').style.display = 'block';
        document.querySelector('label[for="cpu"]').style.display = 'block';
        document.querySelector('label[for="disque"]').style.display = 'block';
        document.querySelector('label[for="ecran"]').style.display = 'block';
      }
    });

  </script>
  <script src="../../vendors/base/vendor.bundle.base.js"></script>
  <!-- endinject -->
  <!-- inject:js -->
  <script src="../../js/off-canvas.js"></script>
  <script src="../../js/hoverable-collapse.js"></script>
  <script src="../../js/template.js"></script>
  <!-- endinject -->
  <!-- Custom js for this page-->
  <script src="../../js/file-upload.js"></script>
  <!-- End custom js for this page-->
</body>

</html>
